use std::io;

fn triangle_side_length_calculation(a: f64, b: f64) -> f64 {
    let process: f64 = a.powf(2.0) + b.powf(2.0);
    let result = process.sqrt();

    return result;
}

fn area_of_triangle(a: f64, b: f64) -> f64 {
    let result: f64 = (a * b) / 2.0;
    return result;
}

fn perimeter_of_triangle(a: f64, b: f64, c: f64) -> f64 {
    return a + b + c;
}

fn main() {
    let mut side_a = String::new();
    let mut side_b = String::new();

    println!("Enter the value for sides a and b: ");

    io::stdin()
        .read_line(&mut side_a)
        .expect("Unable to read input for side a!");

    io::stdin()
        .read_line(&mut side_b)
        .expect("Unable to read input for side b!");

    let side_a: f64 = match side_a.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    let side_b: f64 = match side_b.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    let side_c: f64 = triangle_side_length_calculation(side_a, side_b);
    let area: f64 = area_of_triangle(side_a, side_b);
    let perimeter: f64 = perimeter_of_triangle(side_a, side_b, side_c);

    println!(
        "Area of the triangle is:\t{}\nPerimeter of the triangle is:\t{}",
        area, perimeter
    );
}
