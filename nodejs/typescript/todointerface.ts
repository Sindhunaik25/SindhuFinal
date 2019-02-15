export interface ToDoInterface{
    todoList:string[]
    addTask(task:string):void
    listAllTasks():void
    deleteTask(task:string):void
}