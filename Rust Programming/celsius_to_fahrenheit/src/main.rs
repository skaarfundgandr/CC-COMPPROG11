use std::io;

fn main() {
    let mut fahrenheit = String::new();

    println!("Enter the temperature in Fahrenheit: ");
    io::stdin()
        .read_line(&mut fahrenheit)
        .expect("Cannot read input for Fahrenheit!");

    let fahrenheit: f32 = match fahrenheit.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    println!("Fahrenheit temperature is: {:.1}", fahrenheit);

    let celsius: f32 = (100.0 / 180.0) * (fahrenheit - 32.0);
    println!("Celsius temperature is: {:.1}", celsius);
}
