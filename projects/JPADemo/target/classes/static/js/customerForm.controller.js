var hueApp = angular.module('hue');
hueApp.controller('customerFormController', customerFormController);

customerFormController.$inject = ['$http', '$log', 'formData'];

function customerFormController( $http, $log, customer) {
    var vm = this;
    $log.info('Got customer: ');
    $log.info(customer);
    vm.customer = customer;
}
