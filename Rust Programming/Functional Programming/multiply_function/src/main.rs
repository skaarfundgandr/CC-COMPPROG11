use std::io;

fn multiply(num1: i64, num2: i64) {
    let product: i64 = num1 * num2;
    println!("The product of {num1} and {num2} is {product}");
}
fn main() {
    let mut multiplier = String::new();
    let mut multiplicand = String::new();

    println!("Enter two numbers: ");

    io::stdin()
        .read_line(&mut multiplier)
        .expect("Unable to read input for multiplier!");

    io::stdin()
        .read_line(&mut multiplicand)
        .expect("Unable to read input for multiplicand!");

    let multiplier: i64 = match multiplier.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    let multiplicand: i64 = match multiplicand.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    multiply(multiplier, multiplicand);
}
