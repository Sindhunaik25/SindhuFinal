"use strict";
exports.__esModule = true;
var TodoItem = /** @class */ (function () {
    function TodoItem(title) {
        this.title = title;
        this.status = false;
        this.updatedAt = new Date();
    }
    TodoItem.prototype.toggleStatus = function () {
        if (this.status == true) {
            this.status = false;
        }
        else {
            this.status = true;
        }
    };
    return TodoItem;
}());
exports.TodoItem = TodoItem;
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.TodoItems = new Array();
    }
    TodoList.prototype.addTask = function (TodoItem) {
        console.log(this.TodoItems.push(TodoItem));
    };
    TodoList.prototype.listAllTasks = function () {
        console.log(this.TodoItems);
    };
    TodoList.prototype.deleteTask = function (TodoItem) {
        var len = this.TodoItems.indexOf(TodoItem, 0);
        if (len > -1) {
            var removed = this.TodoItems.splice(len, 1);
            return "number of elements " + this.TodoItems.length + " removed:" + removed;
        }
        else {
            console.log("Pass correct values!!!!!");
        }
    };
    return TodoList;
}());
var list = new TodoList();
var items = new TodoItem("Eat slowly");
var item1 = new TodoItem("Do your homework!!");
list.addTask(items);
list.addTask(item1);
list.listAllTasks();
list.deleteTask(items);
list.listAllTasks();
