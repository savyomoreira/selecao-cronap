
angular.module('crudPessoaApp').controller('CadastroPessoaController',
      function($scope, $http, $q, urls) {

         $scope.pessoa = {};
         getAll();

       function getAll() { $http.get(urls.PESSOA_SERVICE_API)
              .then(function(retorno) {
                $scope.pessoas = retorno.data;
                console.log($scope.pessoa);
              })
              .catch(function(erro) {
                console.log("erro ao consultar os registros")
              });
        }

        $scope.loadToUpdate = function(pessoa){

            $scope.pessoa = {
                id: pessoa.id,
                nome: pessoa.nome,
                dataNascimento: new Date(pessoa.dataNascimento),
                tipoPessoaEnum: pessoa.tipoPessoaEnum,
                cpfCnpj: pessoa.cpfCnpj
            }

            console.log($scope.pessoa);
        }

        $scope.save = function() {
                        console.log($scope.pessoa);
                        console.log('salvar');
                         $http.post(urls.PESSOA_SERVICE_API, $scope.pessoa)
                                .then(
                                   function (response) {
                                        console.log($scope.pessoa);
                                        alert("Salvo com sucesso");
                                        $scope.pessoa = {};
                                        getAll();
                                     },
                                     function (errResponse) {
                                        deferred.reject(errResponse);
                                     }
                                );
                         }


                    

        $scope.removerPessoa = function(id) {

                         $http.delete(urls.PESSOA_SERVICE_API + id)
                             .then(
                                 function (response) {
                                      alert("Excluído com sucesso");
                                      getAll();
                                 },
                                 function (errResponse) {
                                     deferred.reject(errResponse);
                                 }
                             );
                     }


    });