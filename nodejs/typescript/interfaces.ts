import {TodoItem} from './main1'

export interface TodoItemInterface{
    title:string;
    status:boolean;
    updatedAt:Date;
    toggleStatus
}
export interface TodoListInterface{
    TodoItems:TodoItem[]
    addTask(TodoItem:TodoItem)
    listAllTasks()
    deleteTask(TodoItem:TodoItem)
}