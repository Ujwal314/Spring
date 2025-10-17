from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By

search= "mobile"

options = Options()
options.add_argument("--headless")
options.add_argument("--no-sandbox")
options.add_argument("--disable-dev-shm-usage")
options.binary_location = "/usr/bin/google-chrome"

driver = webdriver.Chrome(options=options)

driver.get(f"https://www.flipkart.com/search?q={search}")

print("Page Title:", driver.title)

prices = driver.find_elements(By.XPATH, "//div[contains(@class,'Nx9bqj') and contains(@class,'_4b5DiR')]")

titles = driver.find_elements(By.XPATH, "//div[@class='KzDlHZ']")

ratings = driver.find_elements(By.XPATH, "//div[@class='XQDdHH']")

anchors = driver.find_elements(By.XPATH, "//a[contains(@href, '/p/')]")

availability=[]
for a in anchors:
  driver1 = webdriver.Chrome(options=options)
  driver1.get(a.get_attribute("href"))
  but=[]
  but = driver1.find_elements(By.XPATH, "//button[contains(@class,'QqFHMw') and contains(@class,'AMnSvF') and contains(@class,'v6sqKe')]")
  if(len(but)==0):
    availability.append("Available.")
  else:
    availability.append("Not Available.")

print("\nProduct Title - Price - Rating - Availability:")
for title, price, rate, av in zip(titles, prices, ratings, availability):
    print(f"{title.text.strip()} - {price.text.strip()} - {rate.text.strip()} - {av}")

driver.quit()
