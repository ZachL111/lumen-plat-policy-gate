# Field Notes

The fixture is small on purpose, which makes each domain case carry real weight.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` is the strongest case at 219 on `secret scope`. `stress` is the cautious anchor at 128 on `quota pressure`.

The language-specific addition keeps the review model in a package class with direct assertions.
