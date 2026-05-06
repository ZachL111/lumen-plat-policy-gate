# lumen-plat-policy-gate

`lumen-plat-policy-gate` treats platform engineering as a local verification problem. The Java implementation is intentionally narrow, but the fixtures and notes make the behavior explicit.

## Lumen Plat Policy Gate Checkpoints

Treat the compact fixture as the contract and the extended examples as a scratchpad. The code should stay boring enough that a change in behavior is obvious from the test output.

## What This Is For

This is not a wrapper around a service. It is a self-contained project that shows how the model behaves when demand, capacity, latency, risk, and weight move in different directions.

## Architecture Notes

The core is a scoring model over demand, capacity, latency, risk, and weight. That keeps service shape, route policy, and rollout constraints in one explicit decision path. The threshold is 161, with risk penalty 7, latency penalty 2, and weight bonus 2. The Java implementation uses a compact package layout and direct assertion checks.

## Case Study

The examples are meant to be readable before they are exhaustive. They cover enough variation to show how latency and risk can pull a decision below the threshold.

## Useful Pieces

- Uses fixture data to keep route policy changes visible in code review.
- Includes extended examples for rollout constraints, including `recovery` and `degraded`.
- Documents environment checks tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.
- Stores project constants and verification metadata in `metadata/project.json`.

## Tooling

Install Java and run the commands from the repository root. The project does not need credentials or a hosted service.

## Quality Gate

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Project Layout

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Scope

The scoring model is simple by design. More domain-specific behavior should be added through explicit adapters or extra fixture classes rather than hidden constants.

## Expansion Ideas

- Add a loader for `examples/extended_cases.csv` and promote selected cases into the language test suite.
- Add a short report command that prints the score breakdown for a single scenario.
- Add malformed input fixtures so the failure path is as visible as the happy path.
- Add one more platform engineering fixture that focuses on a malformed or borderline input.

## Local Workflow

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.
