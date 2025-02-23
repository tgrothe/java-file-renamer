# java-file-renamer

A simple Java program that renames all files (and dirs) in a directory to a specified name.

All chars not in this group: `0-9A-Za-z ()[],.-` will be removed.

More than one whitespace will be replaced with a single whitespace.

Whitespaces at the beginning and end of `) ] (` or `[` will be removed.

This sanitizes the filenames to be more readable.

## Usage

`java -jar <jar file> <full path to directory> <dry run (true/false)>`

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request with description. :D

Or: just create an issue with your idea or bug report. You're welcome!
