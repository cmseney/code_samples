# csv_date.py
# Cassandra Seney 2016

# Sample code which reads a CSV file, performs date/time conversion, builds a dictionary of matching values
# and prints dictionary values sorted by key

import csv
import time, calendar

# convert a data/time value into integer seconds 
cutoff_secs = int(calendar.timegm(time.strptime("06 Sep 2010 00:00:00", "%d %b %Y %H:%M:%S")))

my_dict = {}

with open('data.csv', 'r') as csvfile:
    # read the CSV file into reader dictionary
    reader = csv.DictReader(csvfile)
    for row in reader:
        # if the start_date is less than the cutoff, add start_date:words into my_dict
        sd=int(row['start_date'])
        if sd < cutoff_secs:
            my_dict[sd] = row['words']

# print the words, sorted by the start_date key
result = [value for (key, value) in sorted(my_dict.items())]
print(result)

