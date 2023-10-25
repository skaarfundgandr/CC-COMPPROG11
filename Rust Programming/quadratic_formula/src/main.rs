use std::io;

fn main() {
    let mut a = String::new();
    let mut b = String::new();
    let mut c = String::new();

    println!("Enter the value for a: ");

    io::stdin()
        .read_line(&mut a)
        .expect("Cannot read input for a!");

    println!("Enter the value for b: ");

    io::stdin()
        .read_line(&mut b)
        .expect("Cannot read input for b!");

    println!("Enter the value for c: ");

    io::stdin()
        .read_line(&mut c)
        .expect("Cannot read input for c!");

    let a: f64 = match a.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    let b: f64 = match b.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    let c: f64 = match c.trim().parse() {
        Ok(num) => num,
        Err(_) => todo!(),
    };

    let discriminant_formula: f64 = (b * b) - (4.0 * a * c);

    let root1: f64 = (-b + discriminant_formula.sqrt()) / (2.0 * a);

    let root2: f64 = (-b - discriminant_formula.sqrt()) / (2.0 * a);

    println!("The two roots are: {:.2} and {:.2}", root1, root2);
}
