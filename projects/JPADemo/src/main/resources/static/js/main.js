
var hueApp = angular.module('hue', ['ui.bootstrap']);


hueApp.controller('customerController', customerController);

customerController.$inject = ['$scope', '$http', '$uibModal', '$log'];

function customerController($scope, $http, $uibModal, $log) {
    var url = "http://localhost:8080/customers";

    $http.get(url).success(function (response) {
        $scope.customers = response;
    });
    $scope.edit = edit;
    $scope.del = del;

    function edit(customer){
        $log.info('Update');
        $log.info(customer);
        var modalInstance = $uibModal.open({
            animation: true,
            ariaLabelledBy: 'modal-title',
            ariaDescribedBy: 'modal-body',
            templateUrl: 'customerForm.html',
            controller: 'customerFormController',
            controllerAs: '$ctrl',
            size: 'md',
            resolve: {
                'formData': function () {
                    return customer;
                }
            }
        });
    }

    function del(customer){
        $log.info('Delete');
        $log.info(customer);
    }
}
