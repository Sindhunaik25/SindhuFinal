var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14 * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        console.log(this.color + " " + this.area());
    };
    return Circle;
}());
var circle = new Circle("Red", 5);
circle.toString();
var Rectangle = /** @class */ (function () {
    function Rectangle(color, width, height) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    Rectangle.prototype.area = function () {
        return this.height * this.width;
    };
    Rectangle.prototype.toString = function () {
        console.log(this.color + " " + this.area());
    };
    return Rectangle;
}());
var rectangle = new Rectangle("Black", 10, 5);
rectangle.toString();
