import { TodoItemInterface, TodoListInterface } from "./interfaces";

export class TodoItem implements TodoItemInterface{
    title: string;   
    status: boolean;
    updatedAt: Date;

    constructor(title:string){
        this.title=title;
        this.status=false;
        this.updatedAt=new Date();
    }

    toggleStatus(){
    if(this.status==true){
        this.status=false;
    }
    else{
        this.status=true;
    }   
    }
}
 class TodoList implements TodoListInterface{
    TodoItems: TodoItem[]= new Array();    
    addTask(TodoItem: TodoItem) {
        console.log(this.TodoItems.push(TodoItem)) ;
    }
    listAllTasks() {
        console.log(this.TodoItems);
    }
    deleteTask(TodoItem: TodoItem){
        var len=this.TodoItems.indexOf(TodoItem,0);
        if(len>-1){
           var removed= this.TodoItems.splice(len,1);
           return "number of elements "+this.TodoItems.length+" removed:"+removed;
        }
        else{
            console.log("Pass correct values!!!!!");
        }
    }

    
}
var list=new TodoList();
var items=new TodoItem("Eat slowly");
var item1=new TodoItem("Do your homework!!");
list.addTask(items);
list.addTask(item1);
list.listAllTasks();
list.deleteTask(items);
list.listAllTasks();


