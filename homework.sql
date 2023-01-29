-- 춘 기술대학교의 학과 이름과 계열을 표시하시오. 단, 출력 헤더는 "학과 명", "계열"
-- 으로 표시하도록 한다.
SELECT
         DEPARTMENT_NAME  학과명
       , CATEGORY 계열
    FROM TB_DEPARTMENT;
    
-- 학과의 학과 정원을 다음과 같은 형태로 화면에 출력한다.
SELECT
        DEPARTMENT_NAME || '의 정원은' || CAPACITY || '명 입니다.' 
   FROM TB_DEPARTMENT;
   
-- "국어국문학과" 에 다니는 여학생 중 현재 휴학중인 여학생을 찾아달라는 요청이
-- 들어왔다. 누구인가? (국문학과의 '학과코드'는 학과 테이블(TB_DEPARTMENT)을 조회해서
-- 찾아 내도록 하자)
SELECT
        S.STUDENT_NAME
   FROM TB_DEPARTMENT D
   JOIN TB_STUDENT S ON (S.DEPARTMENT_NO = D.DEPARTMENT_NO)
  WHERE SUBSTR(S.STUDENT_SSN,8,1) IN ('2','4') 
    AND S.ABSENCE_YN = 'Y'
    AND D.DEPARTMENT_NAME = '국어국문학과';

-- 도서관에서 대출 도서 장기 연체자 들을 찾아 이름을 게시하고자 핚다. 그 대상자들의
-- 학번이 다음과 같을 때 대상자들을 찾는 적절한 SQL 구문을 작성하시오.
SELECT
        STUDENT_NAME
   FROM TB_STUDENT
  WHERE STUDENT_NO = 'A513091';
  
-- 입학정원이 20 명 이상 30 명 이하인 학과들의 학과 이름과 계열을 출력하시오.
SELECT
        DEPARTMENT_NAME
      , CATEGORY
   FROM TB_DEPARTMENT



