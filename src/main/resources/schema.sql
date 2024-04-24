CREATE table if not exists ticket
(
    id
    int
    auto_increment
    primary
    key,
    ticket_title
    varchar
(
    250
) not null, short_description varchar
(
    250
) not null, content varchar
(
    250
) not null, created_on date);
