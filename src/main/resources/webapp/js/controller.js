(function () {

    'use strict';

    var hello_world_module = angular.module('hello-world');

    hello_world_module.controller("HelloWorldController", function ($scope) {
        $scope.greeting = "Hello World ! ";
    });

}());