var app = angular.module("app", []);

app.controller('controller',
    function () {

        var me = this;

        me.isDownloadShow = true;
        me.isBackButtonShow = false;
        me.onDownloadButtonClick = function () {

            console.log(",jg,mjy");

            me.getBuildings();
            me.setDownloadShow(false);
            me.setBackButtonShow(true);
        };
        me.getBuildings = function(){
            $.ajax({
                type: "GET",
                data: {id: me.id},
                url: 'http://127.0.0.1:8080/data/get',
                success: function(response){
                    console.log(response);
                    me.building = response;
                },
                error: function () {
                    console.log('error');
                }
            });
        };
        me.setDownloadShow = function(isDownloadShow){
          me.isDownloadShow = isDownloadShow;
        };
        me.onBackButtonClick = function(){
            me.setDownloadShow(true);
           me.setBackButtonShow(false);
        };
        me.setBackButtonShow = function(isShow){
            me.isBackButtonShow = isShow;
        }
    });