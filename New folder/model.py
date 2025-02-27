from openai import OpenAI

client = OpenAI(
  base_url="https://openrouter.ai/api/v1",
  api_key="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",
)

completion = client.chat.completions.create(
  extra_headers={
     # Optional. Site title for rankings on openrouter.ai.
  },
  extra_body={},
  model="qwen/qwen-vl-plus:free",
  messages=[
    {
        "role": "system", "content": " You are an expert mental health coach you are going to deal with arabic and english language."
    },
    {
      "role": "user",
      "content": [
        {
          "type": "text",
          "text": "who are u?"
        },
        
      ]
    }
  ]
)
print(completion.choices[0].message.content)