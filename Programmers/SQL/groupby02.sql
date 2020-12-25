SELECT hour, count(*) as count
FROM (SELECT to_char(datetime, 'HH24') hour
     FROM ANIMAL_OUTS)
WHERE hour>=9 and hour<20
GROUP BY hour
ORDER BY hour;