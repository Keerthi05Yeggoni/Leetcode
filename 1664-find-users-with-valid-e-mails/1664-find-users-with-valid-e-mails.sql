# Write your MySQL query statement below
SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z][A-Za-z0-9_\.\-]*@leetcode\\.com$' AND BINARY RIGHT(mail, 13) = '@leetcode.com';