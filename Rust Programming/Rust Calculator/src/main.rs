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
        let operators = operators.as_str();
        if operators == "add" {
            let sum: u32 = num1 + num2;
            println!("The sum is {sum}");
        } else if operators == "subtract" {
            let difference: u32 = num1 - num2;
            println!("The difference is {difference}");
        } else if operators == "multiply" {
            let product: u32 = num1 * num2;
            println!("The product is {product}");
        } else if operators == "divide" {
            let quotient: u32 = num1 / num2;
            println!("The quotient is {quotient}");
        } else {
            println!("Invalid operator!");
        }
        /*match operators.as_str() {
            "add" => {
                let sum: u32 = num1 + num2;
                println!("The sum is {sum}");
            }
            "subtract" => {
                let difference: u32 = num1 - num2;
                println!("The difference is {difference}");
            }
            "multiply" => {
                let product: u32 = num1 * num2;
                println!("The product is {product}");
            }
            "divide" => {
                let quotient: u32 = num1 / num2;
                println!("The quotient is {quotient}");
            }
            _ => {
                println!("Invalid operation!");
                break;
            }
        }*/
    }
}
