namespace Fixtures.SwaggerBatHttp
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class HttpClientFailureExtensions
    {
            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Head400(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Head400Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Head400Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Head400WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Get400(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Get400Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Get400Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Get400WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Put400(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Put400Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Put400Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Put400WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Patch400(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Patch400Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Patch400Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Patch400WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Post400(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Post400Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Post400Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Post400WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Delete400(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Delete400Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 400 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Delete400Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Delete400WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 401 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Head401(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Head401Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 401 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Head401Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Head401WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 402 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Get402(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Get402Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 402 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Get402Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Get402WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 403 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Get403(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Get403Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 403 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Get403Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Get403WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 404 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Put404(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Put404Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 404 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Put404Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Put404WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 405 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Patch405(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Patch405Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 405 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Patch405Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Patch405WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 406 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Post406(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Post406Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 406 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Post406Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Post406WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 407 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Delete407(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Delete407Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 407 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Delete407Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Delete407WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 409 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Put409(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Put409Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 409 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Put409Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Put409WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 410 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Head410(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Head410Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 410 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Head410Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Head410WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 411 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Get411(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Get411Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 411 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Get411Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Get411WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 412 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Get412(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Get412Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 412 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Get412Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Get412WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 413 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Put413(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Put413Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 413 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Put413Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Put413WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 414 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Patch414(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Patch414Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 414 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Patch414Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Patch414WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 415 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Post415(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Post415Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 415 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Post415Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Post415WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 416 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Get416(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Get416Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 416 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Get416Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Get416WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 417 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static Error Delete417(this IHttpClientFailure operations, bool? booleanValue = default(bool?))
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Delete417Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 417 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Delete417Async( this IHttpClientFailure operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Delete417WithOperationResponseAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Return 429 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Error Head429(this IHttpClientFailure operations)
            {
                return Task.Factory.StartNew(s => ((IHttpClientFailure)s).Head429Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 429 status code - should be represented in the client as an error
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Error> Head429Async( this IHttpClientFailure operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Error> result = await operations.Head429WithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
