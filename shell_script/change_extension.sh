#!/bin/bash
for file in *.txt; do
	 mv -- "$file" "${file%.txt}.sh"
done
	    


# The for loop iterates over all files with a .txt extension in the current directory.

# The mv command renames each file by replacing the .txt extension with .bak.

# ${file%.txt} removes the .txt extension from the original filename, and then .bak is appended to it for the new filename.


# the -- is used as a delimiter to indicate the end of options and prevent further option processing. 
