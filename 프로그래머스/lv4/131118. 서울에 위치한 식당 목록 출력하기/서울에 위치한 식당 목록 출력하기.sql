-- 코드를 입력하세요
SELECT I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, TO_CHAR(R.SCORE, '0.99') "SCORE" FROM REST_INFO I JOIN (SELECT REST_ID, ROUND(SUM(REVIEW_SCORE)/COUNT(REVIEW_SCORE),2) "SCORE" FROM REST_REVIEW GROUP BY REST_ID) R ON I.REST_ID=R.REST_ID WHERE SUBSTR(I.ADDRESS, 0, 2)='서울' ORDER BY R.SCORE DESC, I.FAVORITES DESC;