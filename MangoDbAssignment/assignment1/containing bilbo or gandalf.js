db.movies.find({$text:{$search: "dwarves \"hobbit\"" }})