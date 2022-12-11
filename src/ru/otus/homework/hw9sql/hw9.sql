CREATE TABLE questions
(
    id_question SERIAL PRIMARY KEY,
    question    VARCHAR(200) NOT NULL
);

INSERT INTO questions(id_question, question)
VALUES (1, 'В файл с каким расширением компилируется java-файл?'),
       (2, 'С помощью какой команды git можно получить полную копию удаленного репозитория?'),
       (3, 'Какой применяется цикл, когда не известно количество итераций?');

SELECT *
FROM questions;

CREATE TABLE answer_options
(
    id_answer_option SERIAL PRIMARY KEY,
    answer_option    VARCHAR(200) NOT NULL,
    id_question      INT REFERENCES questions (id_question)
);

INSERT INTO answer_options(id_answer_option, answer_option, id_question)
VALUES (1, 'cs', 1),
       (2, 'java', 1),
       (3, 'class', 1),
       (4, 'exe', 1),
       (5, 'commit', 2),
       (6, 'push', 2),
       (7, 'clone', 2),
       (8, 'copy', 2),
       (9, 'while', 3),
       (10, 'for', 3),
       (11, 'loop', 3);

SELECT *
FROM answer_options
ORDER BY id_answer_option;

CREATE TABLE right_answers
(
    id_question  INT REFERENCES questions (id_question),
    right_answer VARCHAR(200) PRIMARY KEY NOT NULL
);

INSERT INTO right_answers
VALUES (1, 'class'),
       (2, 'clone'),
       (3, 'while');

SELECT *
FROM right_answers;

SELECT q.id_question, q.question, ra.right_answer
FROM questions q
         INNER JOIN right_answers ra
                    ON q.id_question = ra.id_question;