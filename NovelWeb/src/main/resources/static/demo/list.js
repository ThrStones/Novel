/**
 * Created by yl on 2017/7/7.
 */
$(document).ready(function () {
    $("#addButton").click(function () {
        $("#addFormDiv").attr('style', 'display : block;margin-top: 30px');
        $("#addForm")[0].reset();
        $("#demoId").val(0);

        $("#title-edit").removeClass("div-block");
        $("#title-edit").addClass("div-none");
        $("#btn-edit").removeClass("div-block");
        $("#btn-edit").addClass("div-none");

        $("#title-add").removeClass("div-none");
        $("#title-add").addClass("div-block");
        $("#btn-add").removeClass("div-none");
        $("#btn-add").addClass("div-block");
    });

    $("#btn-delete").click(function () {
        if (confirm("确定删除数据")) {
            $("#deleteFlag").val(0);
        } else {
            return;
        }
    });
});




