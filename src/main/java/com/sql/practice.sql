#update salary set sex = char(ASCII(sex)^(ASCII('f')^ascii('m')))
#select * from salary
#select * from cinema where id%2 != 0 and description !='boring' order by rating desc
#select class from (select count(se.student)  num,se.class from courses se group by class) a where a.num > 5;
#select count(se.student)  num,se.class from courses se group by class
# select class from courses group by class having count(distinct student) > 5
    # select * from person group by Email
    #delete from person where id in (select Id from person group by Email having count(id) > 1)
          # select Id from person group by Email having  count(id) > 1
    # select  firstname, lastname, city, state from person left join address a on person.PersonId = a.PersonId
    # select e1.name from employee e1, (select * from employee e3 where  e3.ManagerId IS NULL) e2 where e1.ManagerId = e2.Id and e1.Salary > e2.Salary
    # select e1.NAME from employee e1 inner join employee e2 on e1.ManagerId = e2.Id where e1.Salary> e2.Salary
    # select c.NAME customers  from customers c left join orders o on c.Id = o.CustomerId where o.Id is null
    # select e.NAME,d.NAME ,e.Salary from employee e left join department d on e.DepartmentId = d.Id where (e.DepartmentId,e.Salary) in (select DepartmentId,max(salary) from employee group by DepartmentId)
select Salary SecondHighestSalary from employee order by Salary desc limit 1,1