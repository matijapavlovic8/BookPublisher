# BookPublisher

This is a Simple BookPublisher Java app. 
To run it just import the project to your local IDE, run the main class and open your browser to localhost:8080.
Data is stored in an H2 database with PostgreSQL dialect. To inspect database simply go to localhost:8080/h2-console.
Books are searchable by title, genre and their ISBN. While authors are searchable by their full name in "name" + " " + "lastname" format.
Currently it is necessary for searches to be exact. I will, however, try to implement searches that work with likeness, so it won't be necessary to
type in the exact search term.
Sign in currently isn't functional as I will try to implement OAuth autorizathion.
