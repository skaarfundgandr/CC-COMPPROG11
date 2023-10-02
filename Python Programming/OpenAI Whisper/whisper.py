import openai

print("Input OpenAI API key: ")
openai.api_key = input()
print("Input the file location: ")
fileLocation = input()
audio_file = open(fileLocation, "rb")
transcript = openai.Audio.transcribe("whisper-1", audio_file)
f = open("transcribed.txt", "w")

transcript = repr(transcript)
f.write(transcript)
