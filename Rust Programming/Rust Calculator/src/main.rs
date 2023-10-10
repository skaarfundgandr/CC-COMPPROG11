#![allow(non_snake_case)]
use std::io;

fn main() {
    let mut instances = String::new();
    let mut num1 = String::new();
    let mut num2 = String::new();
    let mut operators = String::new();
    println!("Enter the number of instances: ");
    io::stdin()
        .read_line(&mut instances)
        .expect("Cannon read input!");
    let mut instances: u32 = match instances.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };
    while instances > 0 {
        instances -= 1;
        println!("Enter two numbers: ");
        io::stdin()
            .read_line(&mut num1)
            .expect("Cannot read input for num1!");
        io::stdin()
            .read_line(&mut num2)
            .expect("Cannot read input for num2!");
        let num1: u32 = match num1.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };
        let num2: u32 = match num2.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };
        println!("Select an operation: ");
        io::stdin()
            .read_line(&mut operators)
            .expect("Cannot read input!");
        match operators.as_ref() {
            "+" => println!("The sum of {num1} and {num2} is: {}", num1 + num2),
            "-" => println!("The difference of {num1} and {num2} is: {}", num1 - num2),
            "*" => println!("The product of {num1} and {num2} is: {}", num1 * num2),
            "/" => println!("The quotient of {num1} and {num2} is: {}", num1 / num2),
            _ => println!("Invalid operation!"),
        }
    }
}
