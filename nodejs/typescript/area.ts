interface Shape{
    color:string
    area():number
    toString()
}
class Circle implements Shape{
    color:string
    radius:number
    constructor( color:string,radius:number)
    {
        this.color=color;
        this.radius=radius;
    }
    area():number{
        return 3.14*this.radius*this.radius;
    }
    toString(){
console.log(this.color+" "+this.area())    }
}
var circle=new Circle("Red",5);
circle.toString()

class Rectangle implements Shape{
    color:string
    width:number 
     height:number
     constructor( color:string,width:number,height:number)
     {
         this.color=color;
         this.height=height;
         this.width=width;
     }
area():number{
    return this.height*this.width;
}
toString(){
    console.log(this.color+" "+this.area());

}
}
var rectangle=new Rectangle("Black",10,5)
rectangle.toString()