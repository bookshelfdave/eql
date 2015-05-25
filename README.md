EQL: an Elasticsearch Query Language (prototype)
---



## Sample queries

```
connect localhost:9300;
// or
connect elasticsearch localhost:9300;
// only a single connection is supported at the moment

// match all
query bank;

// return a single document
query bank return 1;

// return 10 docs starting from 5
query bank return 10 from 5;

query bank return 3 sort on balance asc;

// multiple sorts
query bank return 3 sort on balance asc, lastname desc;

// only return account_number + balance columns
query bank (account_number, balance);

query bank (account_number, balance) return 1;

// filters
query bank
    filter balance = 1110
    return 1;

query bank
  filter balance = 1110
    and age = 27
  return 1;


query bank (balance, age, account_number)
  filter
    balance = 1110
    and (age = 31 or account_number=953)
  return 1;
```

## Building + Running

```
mvn clean package
./eql
```

##FAQ

- How is it pronounced?
    - "equal"
    
- Why didn't you implement SQL?
    - Elasticsearch isn't a SQL database.
    
- Is EQL usable in production?
    - ***NO NO NO***
    - It's just an idea I had over the weekend.
    
- Are you going to finish this?
    - if theres any interest in it.
    
- Can I contribute?
    - not yet, the code is messy and I need to add tests and stabilize the language.
    
---

#License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2015 Dave Parfitt
