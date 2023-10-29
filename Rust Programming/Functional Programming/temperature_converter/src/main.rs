use std::io;

fn temperature_converter(args: String, n: f64) {
    if args == "Fahrenheit" {
        let fahrenheit: f64 = 32.0 + (n * (180.0 / 100.0));
        println!("{:.1} Celsius is {:.1} Fahrenheit.", n, fahrenheit);
    } else if args == "Celsius" {
        let celsius: f64 = (100.0 / 180.0) * (n - 32.0);
        println!("{:.1} Fahrenheit is {:.1} Celsius.", n, celsius);
    } else {
        println!("Invalid input!");
    }
}

fn main() {
    let mut temperature_value = String::new();
    let mut temperature_selector = String::new();

    println!("Select the temperature measurement that you wish to convert to: ");

    io::stdin()
        .read_line(&mut temperature_selector)
        .expect("Cannot read input!");

    println!("Enter the value that you want to convert to: ");

    io::stdin()
        .read_line(&mut temperature_value)
        .expect("Cannot read input!");

    let temperature_value: f64 = match temperature_value.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    temperature_converter(temperature_selector, temperature_value);
}
