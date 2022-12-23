package com.infinum.bookpublisher.domain;

/**
 * Genre represents the type of published book.
 * @author MatijaPav
 */
public class Genre {

    private GenreType genre;

    public Genre(String genre){
        this.genre = setGenreType(genre);
    }

    private GenreType setGenreType(String genre){
        return switch (genre.toLowerCase()) {
            case "horror" -> GenreType.HORROR;
            case "romance" -> GenreType.ROMANCE;
            case "biography" -> GenreType.BIOGRAPHY;
            case "action" -> GenreType.ACTION;
            case "thriller" -> GenreType.THRILLER;
            case "children" -> GenreType.CHILDREN;
            case "graphic" -> GenreType.GRAPHIC;
            case "mystery" -> GenreType.MYSTERY;
            case "crime" -> GenreType.CRIME;
            default -> GenreType.OTHER;
        };
    }

    public GenreType getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = setGenreType(genre);
    }
}
