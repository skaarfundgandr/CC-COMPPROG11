use std::io;
use std::cmp::Ordering;
use rand::Rng;

fn main() {
    let mut guess = String::new();

    println!("Guess the number!");
    io::stdin()
        .read_line(&mut guess)
        .expect("Unable to read input for guess!");


    let guess: i64 = match guess.trim().parse(){
        Ok(num) => num,
        Err(_) => todo!(),
    };

    println!("You guessed {}.", guess);
    let randint = rand.thread_rng().gen_range(..=100)
    loop {
       
    }
}
