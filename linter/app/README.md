# Linter App Readme

## Version Notes

* 1.0 -- 2022-02-16
  * Initial version

## Functionality

* Displays error message if scanned line in JavaScript file meets the following criteria:
  * Does not end in a semicolon (`;`)
  * AND Does not end in an opening curly brace (`{`)
  * AND Does not end in a closing curly brace (`}`)
  * AND Does not contain `if` OR `else`
  * AND Is not empty