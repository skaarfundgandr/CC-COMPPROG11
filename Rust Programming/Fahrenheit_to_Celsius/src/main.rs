#![allow(non_snake_case)]
use std::io;

fn main() {
    let mut celsius = String::new();
    // Prompt user to enter a value for celsius
    println!("Enter the temperature in Celsius: ");
    io::stdin()
        .read_line(&mut celsius)
        .expect("Unable to read input for celsius!");
    // Convert Celsius to float 32
    let celsius: f32 = match celsius.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };
    // Process
    let fahrenheit: f32 = 32.0 + (celsius * (180.0 / 100.0));
    // Output the value for fahrenheit
    println!("{celsius} Celsius = {fahrenheit} Fahrenheit.")
}
