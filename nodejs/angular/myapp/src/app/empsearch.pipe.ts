import { Pipe, PipeTransform } from '@angular/core';
import { IEmployee } from './iemployee';
@Pipe({
  name: 'empsearch'
})
export class EmpsearchPipe implements PipeTransform {

  transform(employees:IEmployee[], searchTerm:string):IEmployee[] {
    if(!employees||!searchTerm){
      return employees;
    }
    return employees.filter(employees=>employees.name.toLowerCase().
    indexOf(searchTerm.toLowerCase())!==-1);
  }

}
