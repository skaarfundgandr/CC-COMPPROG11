import os
from dotenv import load_dotenv
from openai import OpenAI

if __name__ == "__main__":
    env = open(".env", "w")

    get_api_key = input("Enter your API key: ")
    env.write(f"OPEN_AI_API_KEY = \"{get_api_key}\"")

    load_dotenv()

    prompt = input("Enter a prompt that you want to give to ChatGPT: ")

    client = OpenAI(
        api_key=os.getenv('OPEN_AI_API_KEY')
        )

    completion = client.chat.completions.create(
        model="gpt-3.5-turbo",
        messages=[
            {"role": "system", "content": "You are a teacher on computer programming trying to explain AI tools to your students."},
            {"role": "user", "content": f"{prompt}."}
        ]
    )

    message = completion.choices[0].message

    print(f"{message}")
