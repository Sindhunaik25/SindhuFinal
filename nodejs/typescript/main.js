"use strict";
exports.__esModule = true;
var ToDo = /** @class */ (function () {
    function ToDo() {
        this.todoList = [];
    }
    ToDo.prototype.addTask = function (task) {
        this.todoList[this.todoList.length] = task;
        console.log("Adding task\n" + task + " " + "Number of items" + " " + this.todoList.length);
    };
    ToDo.prototype.listAllTasks = function () {
        console.log("The tasks in the list are");
        for (var index = 0; index < this.todoList.length; index++) {
            console.log(this.todoList[index]);
        }
    };
    ToDo.prototype.deleteTask = function (task) {
        for (var index = 0; index < this.todoList.length; index++) {
            if (this.todoList[index] == task) {
                console.log("Deleting tasks " + task + "\n" + "Number of items in the list are\n" + this.todoList.length);
                this.todoList.splice(index, 1);
                console.log("Number of items in the list are\n" + this.todoList.length);
                break;
            }
            else {
                console.log("Task not found");
                break;
            }
        }
    };
    return ToDo;
}());
var obj = new ToDo();
obj.addTask("wake up!!");
obj.addTask("eat slowly");
obj.listAllTasks();
obj.deleteTask("wake up");
