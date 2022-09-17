--{
--    "companyName":"Net 12",
--    "companySize": 500000,
--    "primaryContact":"Paul Cheek",
--    "city": "Boston",
--    "state": "MA",
--    "netZeroTimeline": 2040,
--    "numCreditsDesired": 5000,
--    "preferredOffesets": ["Carbon Removal", "Agriculture"],
--    "budget": 30000,
--    "carbonCreditId": 12345
--}

CREATE TABLE MEMBERS(
      memberId INT NOT NULL,
      companyName VARCHAR(50) NOT NULL,
      companySize INT NOT NULL,
      primaryContact VARCHAR(50) NOT NULL,
      city VARCHAR(50) NOT NULL,
      state VARCHAR(50) NOT NULL,
      netZeroTimeline INT NOT NULL,
      numCreditsDesired INT NOT NULL,
      --preferredOffsets VARCHAR(50) NOT NULL,
      budget INT NOT NULL,
      carbonCreditId INT NOT NULL,
      PRIMARY KEY (memberId)
);