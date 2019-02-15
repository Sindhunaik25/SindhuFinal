import { Component, OnInit } from '@angular/core';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {
pageTitle:string="Employee Details";
searchTerm:string;
employees:IEmployee[]=[
  {
empId:"164158",
name:"Sindhu",
email:"sindhunaik39@gmail.com",
phone:7022086020,
salary:15000,
appraisalRating:5
  },
  {
    empId:"164159",
name:"Sachin",
email:"sachinnaik39@gmail.com",
phone:8277161779,
salary:15400,
appraisalRating:5
  }
]
  constructor() { }

  ngOnInit() {
  }

}
