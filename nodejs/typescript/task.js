var todoList = [];
function addTask(task) {
    todoList[todoList.length] = task;
    console.log("Adding task\n" + task + " " + "Number of items" + " " + todoList.length);
}
function listAllTasks() {
    console.log("The tasks in the list are");
    for (var index = 0; index < todoList.length; index++) {
        console.log(todoList[index]);
    }
}
function deleteTask(task) {
    for (var index = 0; index < todoList.length; index++) {
        if (todoList[index] == task) {
            console.log("Deleting tasks " + task + "\n" + "Number of items in the list are\n" + todoList.length);
            todoList.splice(index, 1);
            console.log("Number of items in the list are\n" + todoList.length);
            break;
        }
        else {
            console.log("Task not found");
            break;
        }
    }
}
addTask("wake up!!");
addTask("eat slowly");
listAllTasks();
deleteTask("wake up");
