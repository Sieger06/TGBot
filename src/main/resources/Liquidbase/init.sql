--liquibase formatted sql

create table public.task
(
    task_id   bigint generated by default as identity
        primary key,
    chat_id   bigint,
    date_time timestamp,
    text      varchar(255)
);