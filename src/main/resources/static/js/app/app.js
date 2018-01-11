var app = angular.module('crudPessoaApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://localhost:8080/',
    PESSOA_SERVICE_API : 'http://localhost:8080/v1/pessoa/'
});
