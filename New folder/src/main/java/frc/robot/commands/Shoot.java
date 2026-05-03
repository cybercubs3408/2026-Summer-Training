package frc.robot.commands;

public class Shoot {
    
}

/* Math:
 * distance to hub: sqrt((x-a)^2+(y-b)^2), x,y is robot coordinate, a,b is hub coordinate
 * angle to hub: 
 * launch velocity: sqrt[(-gd^2)/((2cos^2(a))(h-dtan(a))] where d is distance to hub, h is height difference, and a is launch angle
 * rotations per min: (60v)/(2pi*r) where r is radius of wheel
 */