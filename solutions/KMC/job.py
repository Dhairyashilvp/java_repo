# importing the libraries
import bs4 as bs
import urllib.request
import pandas as pd

source = urllib.request.urlopen('https://www.bankbazaar.com/personal-loan/instant-loans.html').read()
soup = bs.BeautifulSoup(source,'lxml')

table = soup.find('table', attrs={'class':'table table-bordered'})
res = []
table_rows = table.find_all('tr')
for tr in table_rows:
  td = tr.find_all('td')
  row = [tr.text.strip() for tr in td if tr.text.strip()]
  if row:
    res.append(row)
df = pd.DataFrame(res, columns=res[0])

df.drop(df.head(1).index, inplace=True)


print(df)