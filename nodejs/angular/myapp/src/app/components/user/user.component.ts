import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
name:string;
age:number;
hobbies:string[];
address:Address
  constructor() { 
    console.log("hello");

  }

  ngOnInit() {
    console.log("hi");
    this.name="Savinaya";
    this.age=22;
    this.address={
      street:"Hallibail",
      city:"Sirsi",
      state:"Karnataka"
    };
    this.hobbies=["Sleeping","Eating"];
  }
  onClick(){
    //console.log("Hello")
    this.name="Sindhu"
  }
addHobby(hobby){
  console.log(hobby)
  this.hobbies.unshift(hobby)
  return false
}
onDelete(hobby){
  for(let i=0;i<this.hobbies.length;i++){
    if(this.hobbies[i]==hobby)
    {
      this.hobbies.splice(i,1);
      break;
    }
  }
  
}
}
interface Address{
  street:string;
  city:string;
  state:string;
}
