var app = angular.module("app", []);

app.controller('addController',
    function () {

        var me = this;

        me.isDownloadShow = true;
        me.onAddButtonClick = function () {

            var info = document.getElementById("textarea").value;

            $.ajax({
                    type: "POST",
                    url: 'http://127.0.0.1:8080/data/post',
                    data: {building: info},
                    a: {id: "1", name: "Szkoła", levelList: Array(2), light: 0, heating: 0, …}
                });
            };
    });

